# Job Application Tracker

A Java Command-line Application for managing and tracking Job Applications. The application allow users to track their job application progress through an interactive command line. 

## Features

Users can:

- Add a new job application.
- update the status of an existing application.
- Search for applications by specified filters
- Remove a job application(e.g: once the status is rejected)
- view all job applications currently stored in the tracker.
- Sort Applications by specified fileters

## Java Collections Framework

This project uses built-in components of the Java Collections Framework:

* `ArrayList` stores the job applications.
* `Iterator` safely traverses the collection and removes applications when necessary.
* `Comparator` defines how job applications are sorted.

## Current Project Scope

This version stores applications in memory, which means the data is available only while the program is running. File storage or database support may be added in a future version.
