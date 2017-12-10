# <bindingName> Drayton Wiser Smart Thermostat Binding

Currently very limited to getting and setting room temperatures.

## Supported Things

At the moment this only supports a room and gets the humidity from one device in the room. Many things are on the todo list.

## Discovery

Not yet implemented

## Binding Configuration

To install copy the .jar file to the addons folder. On linux this is /usr/share/openhab2/addons

Find your HeatHub (the part that connects to the boiler) by following these instructions from Chris Evans:
Log out of the app. Make sure you’re at the login screen
Tap Setup / Create Account (even though your system has already been set up).
Select the HubR type
Press the Setup button on the hub
This will start the WiserHeatXXX access point.
Connect to WiserHeatXXX with a real computer. You should get an IP in the 192.168.8.0/24 range.
Perform a GET to the /secret/ endpoint at 192.168.8.1. You might be able to use a browser, I didn’t try. If you prefer powershell like me…

Invoke-RestMethod -Method Get -UseBasicParsing -Uri http://192.168.8.1/secret/

You’ll get the secret back as a string.
Now finish the setup…
Follow the on-screen instructions to connect your smartphone to WiserHeatXXX
Tap Skip when prompted to set up your heating system.
Follow the on-screen instructions to connect your Heat HubR to the
Internet by selecting your new Wi-Fi network.
Tap Skip when prompted to register an account.
You have now changed to a new Wi-Fi network. You will see the home
screen and can proceed to control your heating as normal

## Thing Configuration

Then add the Room to your things file:

draytonwiser:room:livingroom [ deviceIP="192.168.3.6", authToken="YOUR_SECRET_KEY" ]

Replace livingroom with the name you've given your room in the Drayton Wiser App, removing any white space

## Channels

Channels currently supported are Temperature, Humidity and Set Point Temperature.

In the items file add the following:
//Thermostat

Number temperature           "Temperature [%.1f °C]" (gTemp)   { channel = "draytonwiser:room:livingroom:currentTemperature" }

Number humidity              "Humidity [%d %%]"          { channel = "draytonwiser:room:livingroom:currentHumidity" }

Number setPoint              "Set Point [%.1f °C]"   { channel = "draytonwiser:room:livingroom:currentSetPoint" }

Be sure to update the channel to reflect your channel set in the things file.

## Full Example

//ToDo
