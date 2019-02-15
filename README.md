[![Build Status](https://travis-ci.org/skjolber/various-jmh-benchmarks.svg?branch=master)](https://travis-ci.org/skjolber/various-jmh-benchmarks)

# various-jmh-benchmarks
Project for benchmarking various utilities using [JMH].

## License
[Apache 2.0]

# Obtain
The project is based on [Gradle].

# Usage
Modify the build version to your current snapshot, then run 

```
./gradlew --stop && ./gradlew clean jmhClasses jmh --refresh-dependencies --info
```

The JMH plugin seems to have trouble refreshing the project, so restart the Gradle deamon before running.


# History

 - 1.0.0: Initial version

[Apache 2.0]:          			http://www.apache.org/licenses/LICENSE-2.0.html
[issue-tracker]:       			https://github.com/skjolber/java-jwt-benchmark/issues
[Gradle]:              		 	https://gradle.org/
[JMH]:					http://openjdk.java.net/projects/code-tools/jmh/

