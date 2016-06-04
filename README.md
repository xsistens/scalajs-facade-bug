Possible Bug in scala.js with type-parameters in facades
=============

To reproduce execute the following steps:

1. sbt fastOptJS
2. sh server.sh

After that visit [localhost:8000](http:localhost:8000) and open the developer console. The GoodFacade is working as expected but the BadFacade will fail. Only difference between the facades is that the BadFacade's
def has a type parameter. The expected behavior is, that both facades will return the same result.