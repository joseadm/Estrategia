set ORACLE_HOME=C:\Oracle\product\11.2.0\server
set ORACLE_SID=XE 
set NLS_DATE_FORMAT="YYYY-MON-DD HH24:MI:SS"

%ORACLE_HOME%\bin\rman target / log = ./logs/piasojfosdif.log cmdfile ./rman/piasojfosdif.rcv

exit 0