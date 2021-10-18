# Unofficial Nordigen Api (Java)
[![](https://jitpack.io/v/simonhauck/unofficial-nordigen-api-java.svg)](https://jitpack.io/#simonhauck/unofficial-nordigen-api-java)


This project provides a generated java api for
the [Nordigen](https://nordigen.com/en/account_information_documenation/api-documention/overview/) Banking Api which is
specified [here](https://ob.nordigen.com/api/swagger.json).

Important note:
The json is sligtly modified. Some endpoints did not contain a reponse object, which led to Void return types. To prevent this, the response of those endpoints is modified to return a string instead which must be interpreted manually.

## Usage
1. This project is provided via `https://jitpack.io`. Add the registry to your `build.gradle`, `pom` or `build.gradle.kts`
Example `build.gradle`
````shell
repositories {
  ...
  maven { url 'https://jitpack.io' }
}
````
2. Add the dependecy
````shell
implementation 'com.github.simonhauck:unofficial-nordigen-api-java:1.7.1' 
````

## Generated code

The code for this project is generated with the [OpenApi Generator](https://github.com/OpenAPITools/openapi-generator).
The generated code is in the ``generated`` directory.

## Api Documentation

Please refer to
this [README](https://github.com/simonhauck/unofficial-nordigen-api-java/blob/master/generated/README.md)

