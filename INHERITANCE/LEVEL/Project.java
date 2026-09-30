public class Project {

    Project(String projectName) {
        System.out.println("Project: " + projectName);
    }
}

class Aiproject extends Project {

    Aiproject(String name) {
        super(name);
        System.out.println("AI Project constructor");
    }
}

class Main {

    public static void main(String[] args) {

        Aiproject p1 = new Aiproject("doc gen ai");

    }
}