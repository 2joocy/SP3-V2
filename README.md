# SP3-V2
Assignment for SP3

I've made the following assignments, from SP3:

### JPA-MAPPINGEXERCISE 

(https://github.com/2joocy/SP3-V2/tree/master/JPA-MappingExercise)

### JPA-1 

(https://github.com/2joocy/SP3-V2/tree/master/jpa1)

### JPQL 

(https://github.com/2joocy/SP3-V2/tree/master/jpqlDemo)

Text based questions will be answered here, since most of them are concurrent from both JPA-Mapping and JPA-1.

## Describe how you handled persistance in the last three semesters:

Based on previous knowledge learned from the teachers, all we ever used as for storage was storing small values within each VM-Instance. The most common use for us was normal SQL queries, as these were spoken of the most. We had a small interchange once with text files, however that was only used briefly. In the 2nd Semester we learned about sessions, which is data stored on a server, for your current browser-session. If you were to close the tab or the browser, or in any way disconnect from the HTTP server, you would lose all your data stored. 

## Explain Pros and Cons in using a ORM Framework?

### Pros
- Easy to use
- Fast to setup
- Heavily reduces the amount of SQL queries used

### Cons
- Hard to use when working with more complex relations between entities or multi-functions
- Performance Heavy

## Elaborate on some of the problems ORM tries to solve
ORM tries to get rid of clunky mapper handling, which occurs almost every project relevant to database persistancy. ORM is fairly simple if you're working with only a few entities, and have a very small structure in your program. It's aesthetic code, however I do not see the need to use it, compared to good old objective coding.

## Explain the basic "Components" involved in JPA. 
Basic components would be the @Instruction tags that JPA has. You can easilly declare whether the entity should have it's own table, or which of the AUTO_INCREMENT methods you would like to use. You make use of a EntityManager, that commits the data to a table.

## Disclaimer - IMPORTANT
I did experience a lot of problems with EclipsePersistance. Sometimes my program wouldn't run, with almost the same code as the examples given by the teachers. I would make a new project, add dependencies and it would all fail. If I copy-pasted my code over to the example project, it would all work. Some of the errors that I get when working or adding new methods, do not make sense for me at all in this case. Usually debugging code seems rather easy, but since it doesn't tell you specifically what went wrong, I cannot seem to get it fixed. I was at the meeting friday, and everything seemed to work okay. However, when working with the assignments in the weekend, and creating new projects, the same issue occurred multiple times, which is the error you will see once you run my code.

