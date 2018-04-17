# Integration testing assignment

Author: Danny Nielsen.

I've chosen to use the supplied [Glarmester](https://github.com/Cphbusiness-dat1sem-org/Glarmester_solution.git) project for this assignment.

## Integration testing strategy

Before I decided how I'm going to integration test the supplied project, I wrote a short introduction to each of the three candidates:

### Top-down

With this approach, testing mainly takes place in the higher-level modules, and tests will therefore execute scenarios down through the whole system. This means that the system will be tested as a whole, with the correct entry point.

If lower-level modules aren't (fully) developed yet, *stubs/mocks* will have to take their place when testing. This assures that the top-level modules can still freely use lower-level modules as dependencies and control their behaviors.

### Bottom-up

Opposite of the top-down approach, the bottom-up strategy is about testing the lower-level modules first, and working up through the system until all modules are tested. This essentially means that the system is tested in reverse, with focus on the functionality of the underlying modules.

If top-level modules aren't (fully) developed yet, *drivers* will have to take their place when testing. This assures that the lower-level modules will receive some form of fake input, so that they can be tested properly.

### Big bang approach

Essentially a combination of the previous two, the big bang approach is about integrating all of the modules/components at once, and then testing them as whole.

This makes sense for smaller systems, as no stubs or drivers are necessary. All functionality is already implemented. 

It can be a problem with bigger systems though, as it can be easy to miss certain certain modules while testing, because of the amount of modules in general. 



In this particular case, the **big bang approach** fits the best. This is because that the system under test is relatively small, and all functionality is already developed. 

I am primarily going to be testing the database integration in the supplied project. 



## Test cases

The main tests will be performed on the `DataAccessorDatabase` class methods. This is where the most important database logic resides.

| Test case ID |                    Test case description                     | Expected result |
| ------------ | :----------------------------------------------------------: | --------------: |
| 1            |         Get the correct price for glass from the DB          |             300 |
| 2            | Get the correct prices for all three frame types from the DB |     250/200/100 |

If there were any write operations to the database in this sample application, I would copy the production database to a staging database every time tests are run, in order to not tamper with the production data in the database.

This being a small assignment, I chose not to waste time doing this.

### Additional tests 

I am going to test the `PriceCalculator.calculatePrice()` method too, as the program's main functionality lies in this method.

## Test execution

Test execution can be found in the in this project's source code. See the test suite [here](). 

### Test results

