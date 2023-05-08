package docker;

import org.testng.annotations.Test;

import java.io.IOException;

public class Setup_DockerGrid {

    @Test(priority = 1)
    public void startDockerGrid() {
        try {
            String scriptPath = "/Users/zhanarbekabdurasulov/IdeaProjects/QA/selenium-for-docker/start_dockergrid.sh";
            Process process = Runtime.getRuntime().exec(scriptPath);
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Script executed successfully");
            } else {
                System.out.println("Script execution failed");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void stopDockerGrid(){
        try {
            String scriptPath = "/Users/zhanarbekabdurasulov/IdeaProjects/QA/selenium-for-docker/stop_dockergrid.sh";
            Process process = Runtime.getRuntime().exec(scriptPath);
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Script executed successfully");
            } else {
                System.out.println("Script execution failed");
            }
            // it closes all terminals and iTerms
            Runtime.getRuntime().exec("pkill Terminal");
            Runtime.getRuntime().exec("pkill pkill iTerm");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
