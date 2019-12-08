# prova_sicredi 

Software test design with process automation and testing

Branch MASTER

Architecture:

    |-Suites: space to run all the tests scripts

    |--TestCases: where are set the conditions of the flow.

    |---Tasks: here where scenarios manipulate the web Elements(page objects) to run the app into our context

    |----App Objects (pageObjects): variables the represents the elements of a page

Evidence from tests  
 ||Reports/Screenshots 
 
Dependency Manager:  Maven

Code: Java versão 8

Framework: junit 4.12
           selenium WebDriver selenium-java 3.141.59

#Instruções de uso:

Download or clone the repository

Build

Run All Tests: Suites/AllTests.java

Run AllTests.java as Junit Test
