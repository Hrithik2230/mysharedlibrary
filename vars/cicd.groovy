def gitDownload(repo)
{
   git "https://github.com/Hrithik2230/${repo}.git"
}

def newBuild()
{
   sh 'mvn package'
}
