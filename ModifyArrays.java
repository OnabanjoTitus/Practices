public class ModifyArrays {
    public static void main(String[] args) {
int c[]={1,2,3,4,5};
        System.out.printf("The value of the array elements are:");
        for(int value:c){
            System.out.printf("%d",value);
        }
        ModifyArray(c);
        System.out.println();
        System.out.printf("The value of the element after modification");
        for(int value:c){
            System.out.printf("%d",value);
        }
        System.out.println();
        ModifyElement(c[0]);
        System.out.printf("The value of element after element modification is:");
        for(int value:c){
            System.out.printf("%d",value);
        }

    }


    public static void ModifyArray(int [] c2) {
        for(int counter=1;counter<c2.length;counter++){
            c2[counter]*=0;
        }

    }

    public static void ModifyElement(int element) {
        element*=8;
        System.out.printf("The value of element during modification is :%d%n",element);
    }
}
