## Stuff to change:

- `settings.gradle`
- `gradle.properties`
- `fabric/src/main/resoursces/fabric.mod.json`
- `fabric/src/main/resources/mixins.json`

## Steps to get up and running
- Open project (root `build.gradle`) in IntelliJ and let it configure gradle tasks
- Run `genIntellijRuns` task and:
  - Edit run configurations (`Edit Configurations`)
  - Click on each of the Forge run configurations and select the `forge` module along with the right JDK version
