package fr.imt.coffee.machine.cucumber.steps;
import fr.imt.coffee.machine.CoffeeMachine;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Et;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class CucumberStepsPlugDef {

    public CoffeeMachine coffeeMachine;

    @Given("a new coffee machine with {double} l of min capacity, {double} l of max capacity, {double} l per h of water flow for the pump")
    public void givenACoffeeMachine(double minimalWaterCapacity, double maximalWaterCapacity, double pumpWaterFlow){
        coffeeMachine = new CoffeeMachine(minimalWaterCapacity, maximalWaterCapacity, minimalWaterCapacity, maximalWaterCapacity, pumpWaterFlow);
    }

    @When("The user plug the machine")
    public void iPlugTheMachineToElectricity() {
        coffeeMachine.plugToElectricalPlug();
    }

    @And("The machine is functionning")
    public void theMachineIsFunctionning() {
        MatcherAssert.assertThat(coffeeMachine.isOutOfOrder(), Matchers.is(false));
    }

    @Then("The machine is plugged")
    public void isTheMachinePlugged() {
        MatcherAssert.assertThat(coffeeMachine.isPlugged(), Matchers.is(true));
    }


}
