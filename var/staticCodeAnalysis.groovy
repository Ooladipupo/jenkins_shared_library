def call(credentialsid){
  sh 'mvn clean package sonar:sonar'  
}