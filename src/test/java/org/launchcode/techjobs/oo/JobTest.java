package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.testng.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    // Test empty constructor-test
@Test
    public void testSettingJobId() {
    // create the two empty job objects
    Job emptyJobId1 = new Job();
    Job emptyJobId2 = new Job();

    // create the string values for the assertNotEqual part
    int emptyJobId1Expect = emptyJobId1.getId();
    int emptyJobsId2Expect = emptyJobId2.getId();
    // create assert method for test
    assertNotEquals(emptyJobId1Expect, emptyJobsId2Expect, "Testing to see if the empty job constrictor sets two unique values once two objects are created from the job class");
}

    // test full constructor
    @Test
    public void testJobConstructorSetsAllFields() {
    // created job object with full constructor from task
    Job fullConstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       // assertEquals test
    // create string from name field
        String fullConstJobName = fullConstJob.getName();
        String fullConstJobNameValue = "Product tester";
        assertEquals(fullConstJobName, fullConstJobNameValue, "Testing with assertEquals if job object fullConstJob sets the name field to the valuer passed in. design if job class get methods returns the string");
    // assert true for
       boolean fullConstJobNameCondition = (fullConstJob instanceof Job);
       assertTrue(fullConstJobNameCondition, "testing boolean that instance created from job class it set with setName method");

        // create string assert equals for employer field
        String fullConstEmployer = fullConstJob.getEmployer().getValue();
        String fullConstEmployerValue = "ACME";
        assertEquals(fullConstEmployer, fullConstEmployerValue, "Testing if jon constructor passed in the employer correct with get method");
        // assert true test to check instance fo employer class
        boolean fullConstJobNameConditionEmployer = (fullConstJob.getEmployer() instanceof Employer);
        assertTrue(fullConstJobNameConditionEmployer, "Testing employer field is an instance of employer class with getEmployer()");

        // create string and assert equals for location field
        String fullConstLocation = fullConstJob.getLocation().getValue();
        String fullConstLocationValue = "Desert";
        assertEquals(fullConstLocation, fullConstLocationValue, "Checking to see if constructor passes in correct location from instance of object class");
        // assert true to check instance of location field in location class
        boolean fullConstJobNameConditionLocation = (fullConstJob.getLocation() instanceof Location);
        assertTrue(fullConstJobNameConditionLocation, "Testing location firld is an instance of location class");

        //create string and assert equals for PositionType
        String fullConstPositionType = fullConstJob.getPositionType().getValue();
        String fullConstPositionTypeValue = "Quality control";
        assertEquals(fullConstPositionType, fullConstPositionTypeValue, "testing PositionType is passed in once instance of job class is created with full constructor");
        // assert tre to check instance of position type field
        boolean fullConstJobNameConditionPositionType = (fullConstJob.getPositionType() instanceof PositionType);
        assertTrue(fullConstJobNameConditionPositionType, "Testing PositionType field is an instance of PositionType class");

        // create string and assert equals for CoreCompetency
        String fullConstCoreCompetency = fullConstJob.getCoreCompetency().getValue();
        String fullConstCoreCompetencyValue = "Persistence";
        assertEquals(fullConstCoreCompetency, fullConstCoreCompetencyValue, "testing to see that CoreCompetency is passed in when instance of job class is created");
        boolean fullConstJobNameConditionCoreComp = (fullConstJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(fullConstJobNameConditionCoreComp, "Testing CoreCompetency field is an instance of CoreCometency class");
    }

    @Test
    public void testJobsForEquality() {
    Job jobObject1 = new Job("Testing", new Employer("Testing INC"), new Location("Rainforest"), new PositionType("Field Work"), new CoreCompetency("Testing"));
    Job jonObject2 = new Job("Testing", new Employer("Testing INC"), new Location("Rainforest"), new PositionType("Field Work"), new CoreCompetency("Testing"));
    assertNotEquals(jobObject1, jonObject2,"Checking two objects that are identical created from instance of job class are not equal due to their ID");
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
    Job toStringJobTest1 = new Job("Testing", new Employer("Testing INC"), new Location("Rainforest"), new PositionType("Field Work"), new CoreCompetency("Testing"));
    String newline = System.lineSeparator();
    String toStringJobTestToString = toStringJobTest1.toString();
    String testString = newline + "ID: " + toStringJobTest1.getId() + newline +
            "Name: " + toStringJobTest1.getName() +newline +
            "Employer: " + toStringJobTest1.getEmployer() +newline +
            "Location: " + toStringJobTest1.getLocation() + newline +
            "Position Type: " + toStringJobTest1.getPositionType() + newline +
            "Core Competency: " + toStringJobTest1.getCoreCompetency() + newline;
    assertEquals(toStringJobTestToString, testString, "testing when instance of job class us create the to string has liner seperator");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job toStringJobTest1 = new Job("Testing", new Employer("Testing INC"), new Location("Rainforest"), new PositionType("Field Work"), new CoreCompetency("Testing"));
        String newline = System.lineSeparator();
        String toStringJobTestToString = toStringJobTest1.toString();
        String testString = newline + "ID: " + toStringJobTest1.getId() + newline +
                "Name: " + toStringJobTest1.getName() +newline +
                "Employer: " + toStringJobTest1.getEmployer() +newline +
                "Location: " + toStringJobTest1.getLocation() + newline +
                "Position Type: " + toStringJobTest1.getPositionType() + newline +
                "Core Competency: " + toStringJobTest1.getCoreCompetency() + newline;
        assertEquals(toStringJobTestToString, testString, "testing when instance of job class us create the to string has liner seperator");

    }
    @Test
    public void testToStringHandlesEmptyField() {
    String newline = System.lineSeparator();
    Job toStringJobTest1 = new Job("Testing", new Employer(""), new Location("Rainforest"), new PositionType("Field Work"), new CoreCompetency("Testing"));
    String toStringJobTest1ToString = newline + "ID: " + toStringJobTest1.getId() + newline +
                "Name: " + toStringJobTest1.getName() + newline +
                "Employer: " + "Data not available" + newline +
                "Location: " + toStringJobTest1.getLocation() + newline +
                "Position Type: " + toStringJobTest1.getPositionType() + newline +
                "Core Competency: " + toStringJobTest1.getCoreCompetency() + newline;
    String toStringJobTest1ParentString = toStringJobTest1.toString();
    assertEquals(toStringJobTest1ToString, toStringJobTest1ParentString, "Testing tospring brings out data not available when empty field is passed in");
    }
}
