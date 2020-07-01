set axis_lib=D:\development\keWorkSpace\loserStarWebServiceLearning\ClientBase3_genCode\bat\axis-1_4\lib
set java_cmd=java -Djava.ext.dirs=%axis_lib%
set axis_servlet=http://localhost:8888/loser?wsdl
%java_cmd% org.apache.axis.wsdl.WSDL2Java -u %axis_servlet%