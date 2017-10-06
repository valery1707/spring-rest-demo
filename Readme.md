
**Spring Data Rest Demo**

This is a simple demo to use current spring boot milestone together with vavr collection.
It is strange that it is not possible to call spring data rest endpoint(_http://localhost:8080/myEntities_) for the repo after booting the application.
At first you have to trigger an insert into the db to be able to call the above endpoint. Sounds like some vavr classes have to be loaded to be able to respond.
Obviously this happens during creation of a new entry.

* create a new entry in mongoDb:
_http://localhost:8080/api/entities/create?foo=bar_

* access items via Spring Data Rest resource:
_http://localhost:8080/myEntities_

* try to access repo immediately after booting the app: _http://localhost:8080/myEntities_ ... for me it doesn't work


...what is missing?
