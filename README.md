# Clean Architecture

## Resources
- https://medium.com/slalom-engineering/clean-architecture-with-java-11-f78bba431041
    - https://github.com/carlphilipp/clean-architecture-example
- https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html

## Todo's
### Short term
- Repository (Spring Data: JPA & H2) & Running Spring Boot application --> Fully working POC.

### Long term
- Multiple technology stacks (besides Spring). Maybe just a 'manual' one?
- Configuring a full-blown test setup
- Dockerize

### Future
- Write Invoicer stories and implement them
- Front end
- ...

## To study
- Gradle: `compile` is deprecated in favor of `api` and `implementation` for adding dependencies to a project/module.
    - **Read**: https://blog.gradle.org/incremental-compiler-avoidance
    - Paragraph Java Libraries in particular.
- Gradle: Building a  Java 11 (12) multi-module project with JPMS.

## Pitfalls
- Forgetting to require the modules of external dependencies....
    - E.g. I added the spring-boot-starter-web dependency through Gradle in the adapter > controller module. 
    However, I wasn't able to use (e.g.) the `@RestController` dependency. After checking the dependency tree 
    using task `dependencies` (`gradlew :springrest-controller:dependencies`) I could validate that the all the 
    dependencies were correctly downloaded. **However**, I completely forgot to require the specific Spring 
    module to my `module-info.java` specification (`require spring.web;`).