package cl.evilgenius.mvp_par_impar;

public class N_evenPresenter {

   private N_evenCallback callback;

    public N_evenPresenter(N_evenCallback callback) {
        this.callback = callback;
    }

    public void isEven(String number){

        int num = Integer.parseInt(number);

        if (num % 2 == 0){
            callback.even();
        }else{
            callback.notEven();
        }


    }
}
