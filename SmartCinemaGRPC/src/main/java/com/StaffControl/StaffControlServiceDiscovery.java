package com.StaffControl;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;
import javax.jmdns.ServiceInfo;

public class StaffControlServiceDiscovery {

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

            // Define the service type to look for
            String serviceType = "_staffcontrol._tcp.local.";

            // Add a service listener
            jmdns.addServiceListener(serviceType, new ServiceListener() {
                @Override
                public void serviceAdded(ServiceEvent event) {
                    System.out.println("StaffControl Service added: " + event.getInfo());
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println("StaffControl Service removed: " + event.getInfo());
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    ServiceInfo serviceInfo = event.getInfo();
                    System.out.println("StaffControl Service resolved: " + serviceInfo);
                    System.out.println("Service Name: " + serviceInfo.getName());
                    System.out.println("Service Type: " + serviceInfo.getType());
                    System.out.println("Service Host: " + serviceInfo.getHostAddresses()[0]);
                    System.out.println("Service Port: " + serviceInfo.getPort());
                }
            });

            // Keep the discovery running
            Thread.sleep(30000); // Listen for 30 seconds

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
