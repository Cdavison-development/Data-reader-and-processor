public class ERDataProcessor {

    private double data[] = new double [0]; /* Creating data array and defining average rate */
    private double averageRate = 100;


    public void process(String data){
        String[] lines = data.split("/r");               /* split function using "/r" as a separator, */
        double[] Conversionfigure= new double[lines.length];   /*creating a second array that will change when lines
                                                                 array does */
        double amount = 0;
        for (int i=0; i<lines.length; i++){                      /*creating a second array that will change when lines
                                                                   array does */
            Conversionfigure[i]=Double.parseDouble(lines[i]);
            amount+=Conversionfigure[i];
        }
        this.data=Conversionfigure;
        this.averageRate = amount/(double)lines.length;

    }

    public double poundToDollar(double p){   /* method for converting pound to dollars */

        p = p * averageRate;

        return p;
    }

    public double dollarToPound(double d){  /* method for converting dollars to pounds */
        d = d / averageRate;

        return d;
    }

    public void setData(double[] data){  /* method to set data attribute to this.data */
        this.data = data;
    }

    public double[] getData(){  /* returns data attribute */
        return data;
    }



    public double getAverageRate(){     /* method for returning average rate */
        return averageRate;

    }

    public void setAverageRate(double averageRate){   /* method for setting averageRate to this.averageRate */
        this.averageRate = averageRate;
    }


}
