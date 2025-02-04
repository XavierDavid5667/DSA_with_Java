package basics;

public class SwitchWithEnum {
    public static void main(String[] args) {
        Direction south = Direction.SOUTH;
        //This is normal switch statement
        switch (south){
            case NORTH:
                System.out.println("Heading North");
                break;
            case SOUTH:
                System.out.println("Heading south");
                break;
            case EAST:
                System.out.println("Heading east");
                break;
            case WEST:
                System.out.println("Heading west");
                break;
            default:
                System.out.println("Hey this is the default answer from my end!");
                break;
        }

        //this is switch expressoin where we can get a value from the switch
        String direction = switch (Direction.NORTHEAST) {
            case NORTH -> "Heading North";
            case SOUTH -> "Heading south";
            case EAST -> "Heading east";
            case WEST -> "Heading west";
            default -> "Hey this is the default answer from my end!";
        };

        System.out.println("Switch Expression "+direction);

    }
}
