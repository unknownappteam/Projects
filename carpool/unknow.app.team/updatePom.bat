@echo off
SET version=%1
mvn release:update-versions -DdevelopmentVersion=%version%