public void maoPao(int[] arr){
        int a = arr.length -1；
        for(int i =0; i< a;){
            for(int j = 0; j<a; j++){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
            a--;
        }
    }
