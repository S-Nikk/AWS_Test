package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.*;



public class lambdatest implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

        public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
            APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();

          
            String responseBody = "Hello from Lambda!";

            response.setStatusCode(200);
            response.setBody(responseBody);

            return response;
        }


        
        public static void main(String[] args) {
            APIGatewayProxyRequestEvent request = new APIGatewayProxyRequestEvent();

            Context context = new TestContext();

            lambdatest handler = new lambdatest();
            APIGatewayProxyResponseEvent response = handler.handleRequest(request, context);

          
            System.out.println(response.getBody());
        }
    }
