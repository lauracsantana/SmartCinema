package com.DoorControl;

import javax.jmdns.ServiceInfo;
import javax.jmdns.JmDNS;

public class DoorControlServiceRegistration {

    public static void main(String[] args) {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = null;
			try {
				jmdns = JmDNS.create();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            // Define service type and properties
            String serviceType = "_doorcontrol._tcp.local.";
            String serviceName = "DoorControlService";
            int servicePort = 50051; // Port where your gRPC server is running

            // Create a ServiceInfo object
            ServiceInfo serviceInfo = ServiceInfo.create(
                serviceType,
                serviceName,
                servicePort,
                "path=index.html" // optional: add properties if needed
            );

            // Register the service
            try {
				jmdns.registerService(serviceInfo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("DoorControlService registered: " + serviceInfo.getName());

            // Keep the service registered
            Thread.sleep(30000); // Keep service registered for 30 seconds

            // Unregister the service
            jmdns.unregisterService(serviceInfo);
            System.out.println("DoorControlService unregistered.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
