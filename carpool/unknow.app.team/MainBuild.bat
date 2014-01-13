@echo off
set buildVersion=%1
set devVersion=%2
@echo %buildVersion%
call updatePom.bat  %buildVersion%
call build.bat
call updatePom.bat %devVersion%
