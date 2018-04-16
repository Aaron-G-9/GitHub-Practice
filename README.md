# Git-Practice

## Introduction
Working with version control is an essential part of any software team. Since we're not exactly sure how familiar new students will be with Git, included in this documentation is a link to several quick guides/tutorials. This repository exists to provide a playground of sorts - a repository without any serious project that our team can use to ensure new students can push, pull, merge, and make issues correctly. 

## Recommended Reading
The [GitHub Guides](https://guides.github.com/) are very nice resources for general git knowledge. It is up to you to evaluate your knowledge level and choose the appropriate guide.  
For a MySail specific best-practice guide, take a look at [Brandon's blog](http://brandonsdevblog.me/post/git-workflow/)  

## Basic Overview
On the MySail team, it's important to keep our code, issues, and branches organized. The general flow of submitting a new feature or bug fix is as follows:  
- Submit an issue with a title, description, and screenshot if applicable  
- Create a branch. Branch naming convention is the first two letters of the project followed by a dash followed by the issue number you'll be working on.  
  - Ex: For MyDetails we'd create a branch like `MD-5`
- When commiting, be sure to reference the issue number  
  - Ex: `Fixes incorrect margin on button #5`
- When submitting a pull request for your branch, be sure to assign someone with access, and be sure to include `closes #{issue_number}` in the description (This will automatically close the issue). 

## First Task
Add your name in the new students.txt file. Do this the proper way - create an issue, a matching branch, etc.  

## Second Task
Using HTML and CSS, recreate (to the best of your abilities) the screenshot of the webpage in this repository (using an image of your choice). Use header tags, a table, an img tag, paragraph and div tags

## Remaining Tasks are in order of your choice

### React Task
On the MySail team, we've used the javascript framework React from its earliest days. Before React, MySail had page reloads for (what seemed like) every button click. Now we're able to change the User's view seamlessly! This is accomplished in huge part to React's concept of State and the Virtual Dom. Any student working on the MySail team should have a basic understanding of React - as we're moving to use it in all but the simplest of portlets.  
[Here](https://reactjs.org/tutorial/tutorial.html) is a tutorial to follow. Submit the final product on GitLab for a code review 

### Webapp Task
Create a simple webapp. It should have a backend API which the frontend hits. A suggestion is a simple movie information website. It would have a number of movies that you could choose from, and it would display detailed information about the chosen one. The API could look something like `api/movies/iron_man`  
Whatever you choose, make the project with [Spring Boot](https://start.spring.io/)  
Some things to keep in mind:
  - Choose a gradle project
  - Choose some version of Spring 2
  - Choose `web` and `rest repositories` as your dependencies (you'll be making a [RESTFUL API](https://en.m.wikipedia.org/wiki/Representational_state_transfer))
  - [Here](https://spring.io/guides/gs/rest-service/) is a tutorial to help

### Simple Issues on GitLab