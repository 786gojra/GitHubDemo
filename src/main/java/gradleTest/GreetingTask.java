//package gradleTest;
//
//import org.gradle.api.DefaultTask;
//import org.gradle.api.tasks.Input;
//import org.gradle.api.tasks.TaskAction;
//
//public class GreetingTask extends DefaultTask {
//
//    private String greetingName;
//
//    // Create the Setter for the above private property
//
//    public void setGreetingName(String greetingName){
//        this.greetingName= greetingName;
//    }
//
//    @Input
//    public String getGreetingName(){
//        return greetingName;
//    }
//
//    @TaskAction
//    public void toGreet(){
//        getLogger().quiet("Greeting Dear:"+greetingName);
//    }
//}
