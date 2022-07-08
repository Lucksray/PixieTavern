# Intro

Pixie Tavern is a simple Java to MYSQL integration program that allows an owner to edit and keep track of items in the database as well as customers.
This repository holds all coding for Java, maven testing and other files that are necessary for Java to run as expected.
The rest of this README file holds information on updates, future plans, a risk assessment and problems found along the way.

## Contents
* [Current Version & Limit](#current-update)
* [Road map](#road-map)
    * [Version 0.1](#version-01)
    * [Version 0.2](#version-02)
    * [Version 0.3](#version-03)
    * [Version 0.4](#version-04)
    * [Version 0.5](#version-05)
* [Known problems](#known-problems)
* [Fixes](#fixes)
* [Mentions](#shout-outs)


### Current update

The ~~current~~ version 0.1 allowed the owner to access the database and add, edit, delete and view all data on the database with no restrictions.
This version should only be given out to those that the owner puts their trust in and will help build upon the database.
This version should not be released to the public before any access limitation is put in place to allow some privacy for personal information and resrictions on editting the databases more sensitive data.

The ~~current~~ version that the main version is updated to is version 0.2.
The owner and customer are able to access the information on the database although the customer has limited access to information.
A customer can only view non-personal information and information about themselves from the database.
This information restriction is currently hard-coded in and requires a sign in on all necessary Methods.

The current version 0.3 allows customers to make a login for ordering items.
This is still a mandatory procedure and is required everytime a new order is placed.
Orders are also seen by the owner as completed or not completed so know what orders need to be sent off.
Customers can also view orders but only their own orders to keep privacy in check.


### Road Map

###### **Version 0.1**

For the owner to be able to view customers and items on the database.
For the owner to be able to delete, update and add customers and items on the database.

###### **Version 0.2**

To allow customers to have a login for the database which saves their previous and current orders for reference for the owner's view.
To have a compulsory login portal for customers and owner to allow privileges while browsing the database.

###### **Version 0.3**

To allow customers to add to add, delete items from and submit their current trolleys
To allow customers to *view* their previous trolleys and orders.
To allow the owner to accept orders.
To allow the owner to view which orders have been accepted/completed or not.

###### **Version 0.4**

To make the login optional for those who wish to just browse items from the database.
To allow non-sign up customers to place orders from trolleys with limited items.
Upon submitting an order, a double check of signing in or signing up their login details.

###### **Version 0.5**

To make a few infrastructure tweaks to allow smoother and faster data transfer between the database and application.
To make a few design tweaks to the GUI to make it more pleasing to the eye.


#### Known problems

Here a list of known problems or fixes to be implemented as updates come out:
- Not all access restricted Methods are implemented
- The only way to give access rights to a new login user is to contact directly with the database server and change rights through the IDE
- Not all Methods are functioning completely and require seperate class files to be written to explain what each Method does accurately
- Trolleys are currently not a function as there is no lingering sign-in prospect currently implemented
- The owner cannot change orders' completion boolean through software currently until a rework of the infrastructure
- Currently undergoing Mock Environment test difficulties which have an adverse affect on all tests requiring the Login features, however actual software code runs fine.

#### Fixes

- [ ] Not all access restricted Methods are implemented
- [ ] The only way to give access rights to a new login user is to contact directly with the database server and change rights through the IDE
- [ ] Not all Methods are functioning completely and require seperate class files to be written to explain what each Method does accurately
- [ ] Trolleys are currently not a function as there is no lingering sign-in prospect currently implemented
- [ ] The owner cannor change orders' completion boolean through software currently until a rework of the infrastructure
- [ ] Fix Mockito issues creating a mock environment of tables


#### Shout outs

Thanks to the wonderful teaching staff at QA for helping me through this opportunity and for the support of fellow colleagues pushing me through the difficult moments.
Also a huge thanks to stack-overflow for always coming in handy when I got stuck at a proplem I couldn't figure out on my own.