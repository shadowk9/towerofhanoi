class GFG {
    static void towerHanoi(int n, char from_rod, char to_rod, char aux_rod){
        if(n==1)
        {

            System.out.println("move disk 1 from rod"+ from_rod+"to rod"+to_rod);
            return;
        }
        towerHanoi(n-1,from_rod,aux_rod,to_rod);
        System.out.println("move disk"+n+"from rod"+from_rod+"to rod"+to_rod);
        towerHanoi(n-1,aux_rod,to_rod,from_rod);
    }

}
