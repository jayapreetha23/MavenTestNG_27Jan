pipeline{
	agent{
		docker{
		image 'maven:latest'
		}
	}
	environment{
		VERSION='0.9.1'
		REL_VER='RES.4'
	}
	stages{
		stage('build'){
			steps{
				sh '''
					echo "Hello, This is Build with version as ${VERSION} and release as ${REL_VER}"
					java -version
					mvn -version
					ls
					
				'''
			
			}
		
		}
		
		stage('test'){
			steps{
				sh '''
					echo "Hello, This is Test with version as ${VERSION} and release as ${REL_VER}"
					
					
				'''
			
			}
		
		}
	}
}
