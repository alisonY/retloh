/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.retloh.ftpserver;

import java.util.UUID;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.UserManager;
import org.apache.ftpserver.impl.DefaultFtpServer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.retloh.model.FtpUser;

/*
 * @author <a href="http://mina.apache.org">Apache MINA Project</a>
 */
public class FtpServerListener implements ServletContextListener {

	public static final String FTPSERVER_CONTEXT_NAME = "org.apache.ftpserver";

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Stopping FtpServer");

		FtpServer server = (FtpServer) sce.getServletContext().getAttribute(FTPSERVER_CONTEXT_NAME);

		if (server != null) {
			server.stop();

			sce.getServletContext().removeAttribute(FTPSERVER_CONTEXT_NAME);

			System.out.println("FtpServer stopped");
		} else {
			System.out.println("No running FtpServer found");
		}

	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Starting FtpServer");

		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());

		DefaultFtpServer server = (DefaultFtpServer) ctx.getBean("myServer");

		sce.getServletContext().setAttribute(FTPSERVER_CONTEXT_NAME, server);

		UserManager userManage = server.getUserManager();
		// UserManager userManage = new FtpServerUserManager();
		try {
			
			userManage.delete("admin");

			FtpUser user = new FtpUser();
			String id = UUID.randomUUID().toString();
			user.setId(id);
			user.setName("admin");
			user.setEnabled(true);
			user.setHomedirectory("/data");
			user.setPassword("admin");
			user.setWritepermission(true);
			user.setIdletime(0);
			user.setUploadrate(1000);
			user.setDownloadrate(1000);
			user.setMaxloginnumber(100);
			user.setMaxloginperip(100);
			userManage.save(user);

			System.out.println("********************************************");
			System.out.println(userManage.getAdminName());

			server.start();
			System.out.println("FtpServer started");
		} catch (Exception e) {
			throw new RuntimeException("Failed to start FtpServer", e);
		}
	}

}
