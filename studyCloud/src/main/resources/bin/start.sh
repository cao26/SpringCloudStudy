#!/bin/bash
curpath=`pwd`
app=xxl-job-admin-2.1.0.jar
echo 'curpath:$curpath    app:$app'
ps -aux|grep $curpath/$app|grep -v grep|awk '{print $2}'|xargs -r kill -9
