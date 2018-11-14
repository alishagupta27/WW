# WW
Prerequites - Java 8 and Maven 3.5.1 If you have another version then you might want to change a configuration in pom.xml

pom.xml (#14-21)

<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-compiler-plugin</artifactId>
<version>3.5.1</version>
<configuration>
   <source>1.8</source>
   <target>1.8</target>
   <verbose>true</verbose>
</configuration>


I have tested on Windows platform. In Mac OS there can be some browser issues.
