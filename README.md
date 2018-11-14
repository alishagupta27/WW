# WW
# Prerequisites and how to use it - Java 8  and Maven 3.5.1 

If you have any other version then you might want to change a configuration in pom.xml


pom.xml (#14-21)

<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-compiler-plugin</artifactId>
<version>3.5.1</version>
<configuration>
   <source>1.8</source>
   <target>1.8</target>
   <verbose>true</verbose>
</configuration>

Download or clone from this repo

Start the command prompt and move to the WW folder and run


mvn test


It should open firefox and start testing!
