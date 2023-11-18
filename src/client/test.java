package client;


import javax.xml.ws.Endpoint;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
//
        // 1.指定调用WebService的URL,这里是我们发布后点击taxprocedure
    String url = "http://localhost:8080/webService_demo/services/taxProcedure?wsdl";
////        这里使用EndPoint发布：
//        Endpoint.publish(url1, new TaxProcedureServiceLocator() );
        try {
            // 2.创建Locator对象,相当于传统服务的类或者是库
            TaxProcedureServiceLocator taxProcedureServiceLocator = new TaxProcedureServiceLocator();
            // 3.获取port,相当于传统类或库的方法接口
            TaxProcedure_PortType service = taxProcedureServiceLocator.gettaxProcedure(new URL(url));
            // 4.通过port调用服务
            Scanner input = new Scanner(System.in);
            System.out.print("请输入您的收入(元)：");
            double income = input.nextDouble();
            double result = service.incomeaxProcedure(income);
            double tax=0;
            if (income <= 5000) {
                tax = 0;
            } else if (income > 5000 && income <= 8000) {
                tax = (income - 5000) * 0.03;
            } else if (income > 8000 && income <= 17000) {
                tax = 150 + (income - 8000) * 0.1;
            } else if (income > 17000 && income <= 30000) {
                tax = 1050 + (income - 17000) * 0.2;
            } else if (income > 30000 && income <= 40000) {
                tax = 3450 + (income - 30000) * 0.25;
            } else if (income > 40000 && income <= 60000) {
                tax = 7950 + (income - 40000) * 0.3;
            } else if (income > 60000 && income <= 80000) {
                tax = 13950 + (income - 60000) * 0.35;
            } else {
                tax = 21950 + (income - 80000) * 0.45;
            }

            System.out.println("您的工资是：" + income+"元");
            System.out.println("您需要缴纳的个人所得税为：" + result+"元");
        }catch (ServiceException | RemoteException | MalformedURLException ex){
            ex.printStackTrace();
        }
    }
}
