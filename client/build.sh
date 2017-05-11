#!/bin/sh

gcc -I ./include -L ./lib/ -lcurl -o login login.c