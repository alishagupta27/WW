# WW
# Prerequisites and how to use it - Java 8  and Maven 3.5.1 

1. If you have any other version then you might want to change a configuration in pom.xml
   - For Java 8 lines #13-14 will be 1.8.
   - For Apache 3.6.0 or below, change line #12 to 3.5.1

```
pom.xml (#17-22)

<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-compiler-plugin</artifactId>
<version>3.7.0<version>
<configuration>
   <source>10</source>
   <target>10</target>
   <verbose>true</verbose>
</configuration>
```

2. Download or clone from this repo

3. Start the command prompt and move to the WW folder and run

```
mvn test
```

4. It should open Chrome and start testing!

Note: I have tested this in Windows laptop and have used the windows driver. I have also provided the Chrome Mac driver and can be used. However, I have not tested it because I do not have Mac.
