# Java SPI

### the Service Provider Interface (SPI) in Java 

### Relevant Articles:

- [Java Service Provider Interface](https://www.baeldung.com/java-spi)


---

## How to add/remove plugins?


### Solution 1

- ####  ``` jar -cvf0m currency-rates.jar META-INF/MANIFEST.MF . ```

- Unzip the jar: currency-rates.jar
- Add or remove plugin jars to or from "BOOT-INF/lib"
- Make a new jar again
  - ``` -c ```, ``` --create ``` : Create the archive
  - ``` -v ```, ``` --verbose ``` : Generate verbose output on standard output
  - ``` -f ```, ``` --file=FILE ``` : The archive file name
  - ``` -0 ```, ``` --no-compress ``` : Store only; use no ZIP compression
  - ``` -m ```, ``` --manifest=FILE  ``` : 
    - Include the manifest information from the given manifest file


### Solution 2

- #### Change maven pom file to add or remove dependencies
- #### Run ``` mvn clean package ``` again 
