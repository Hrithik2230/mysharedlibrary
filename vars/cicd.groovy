def gitDownload(repo)
{
   git "https://github.com/Hrithik2230/${repo}.git"
}

def newBuild()
{
   sh 'mvn package'
}

def newDeploy(jobname,ip,appname)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${appname}.war"
}
