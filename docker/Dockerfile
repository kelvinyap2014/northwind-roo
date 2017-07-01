# Base image, JDK 8
FROM openjdk:8-jdk

# The maintainer
MAINTAINER Kelvin Yap https://www.linkedin.com/in/kelvin2014/

# Update the sources list
RUN apt-get update

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
ADD . /app

# Build northwind-roo
RUN /app/build.sh

# Make port 8080 available
EXPOSE 8080

# Run app.sh when the container launches
CMD ["bash", "app.sh"]