#include <json/json.hpp>
#include <vector>
#include <iostream>
#include <fstream>
#include <map>
#include <string>

using namespace std;
using json = nlohmann::json;

struct CaseInfo { 
	string serialNumber;

	string name;

	string citizenNumber;

	int age;

	string sex;

	string clinicNumber;

	string bedNumber;

	int recordYear;

	int recordMounth;

	int recordDay;

	int recordMinutes;

	string operationDoctor;

	string diagnosticDoctor;

	int status;

	string department;

	string hospitalNumber;

	string hospitalName;

	string defaultHospitalName;

	string hospitalAddress;

	string hospitalPhonenum;

	string hospitalFax;

	int patientYear;

	int patientMonth;

	int patientDay;

	int daolianshu;

	int sumHours;

	string pacemakerParameter;

	int offset;

	string suggest;

	string conclusion;

	string yongyaoshuoming;

	string note;

	string caseTag;

	string holterLoadDate;

	string createTime;

	string updateTime;

	string handwrittenConclusion;

	string pdfexportFilepath;

	string originalFilepath;

	string analyzedFilepath;
};

int main()
{
	std::vector<int> v = {3, 1, 4, 1, 5, 9};
	for (std::vector<int>::reverse_iterator i = v.rbegin(); i != v.rend(); ++i)
	{
		std::cout << *i << '\n';
	}

	json j;
	j.push_back("foo");
	j.push_back(1);
	j.push_back(true);

	// also use emplace_back
	j.emplace_back(1.78);
	//
	// // iterate the array
	for (json::iterator it = j.begin(); it != j.end(); ++it)
	{
		std::cout << *it << '\n';
	}

	//std::map<std::string, int> c_map;
	ifstream ifstm("./info.txt", ios::out | ios::binary);
	if (!ifstm)
	{
		exit(1);
	}

	vector<string> vec; //用来存储从文件中读取的内容
	string tmp;
	while (!ifstm.eof())
	{
		ifstm >> tmp;		//一行一行的读取
		vec.push_back(tmp); //将读取的信息存进vector里面 ,从尾部插入
	}
	ifstm.close();
	//vector<string>::iterator it;
	CaseInfo caseinfo;
	caseinfo.serialNumber=vec[0];
	caseinfo.name=vec[1];
	caseinfo.citizenNumber="320381191919232";

	/*caseinfo.age;

	caseinfo.sex;

	caseinfo.clinicNumber;

	caseinfo.bedNumber;

	caseinfo.recordYear;

	caseinfo.recordMounth;

	caseinfo.recordDay;

	caseinfo.recordMinutes;

	caseinfo.operationDoctor;

	caseinfo.diagnosticDoctor;

	caseinfo.status;

	caseinfo.department;

	caseinfo.hospitalNumber;

	caseinfo.hospitalName;

	caseinfo.defaultHospitalName;

	caseinfo.hospitalAddress;

	caseinfo.hospitalPhonenum;

	caseinfo.hospitalFax;

	caseinfo.patientYear;

	caseinfo.patientMonth;

	caseinfo.patientDay;

	caseinfo.daolianshu;

	caseinfo.sumHours;

	caseinfo.pacemakerParameter;

	caseinfo.offset;

	caseinfo.suggest;

	caseinfo.conclusion;

	caseinfo.yongyaoshuoming;

	caseinfo.note;

	caseinfo.caseTag;

	caseinfo.holterLoadDate;

	caseinfo.createTime;

	caseinfo.updateTime;

	caseinfo.handwrittenConclusion;

	caseinfo.pdfexportFilepath;

	caseinfo.originalFilepath;

	caseinfo.analyzedFilepath;*/



	/*for (it = vec.begin(); it != vec.end(); ++it)
	{
		std::cout << *it << '\n';
		std::cout << "--------------------" << '\n';
	}*/

	std::cout << "--------------------" << '\n';
	std::cout << caseinfo.serialNumber << '\n';
	std::cout << "--------------------" << '\n';


}
