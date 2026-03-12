# Store

Make tests and implement the Store and the Necklace objects.

## Necklace Object 
The Necklace class will have the following

* price
* name
* item_id
* date_created

You are free to use any data type you wish, but make sure that
you have all the getters and setters you need for each field
and be prepared to defend your decisions.

## Store
The Store class will have the following

* name
* owner_name
* products

You are free to use any data type you wish except for the products
which will be an array of Necklaces. The Store should have 
getters and setters for these attributes as well as a `sell` 
method that will take an argument `itemId` and remove that from
the array of products. It should also have a `restock` method that
will refill the array of products. 

When a store is created it should be created with 20 necklaces
that will be sold. When restock is called, the store will receive
as many necklaces as it needs to get back to 20. (e.g. if the
store currently has 16 necklaces it should receive 4.)
