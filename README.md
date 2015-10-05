# Himline Training
Training Contents 

This Himline Repository is made for committing the training code by indivdual memebers. They can also commit small solutions in it.

#Git & GitHub Basics
https://www.youtube.com/playlist?list=PLfdtiltiRHWFEbt9V04NrbmksLV4Pdf3j

#Install Git on windows
Go to the site https://git-Scm.com/download/win

               Download file
               >click on next
               >click on next
               >click on next
               >choose use git from the window command prompt
               >choose use open SSH
               >click on next
               >choose use window default console window
               >click on enable file system catching
               >finish
               
  # How to create path
  
                >Go to c drive 
                >select programs file
                >click on git
                >click on bin
                >copy the path from address bar
                >Go to the computer properties
                >choose advanced setting
                >click on environmental variables
                >click on New 
                       >variable name "PATH"
                       >variable value "Paste the copied path from address bar"
                >click on ok
                
                     
  #Local System 
- Create workspace directory 
                 c:/_workspace/training/<first part of himline email id)
		>Example 
		>c:/_workspace/training/sanjeev.katoch
		
- Make a simple MVC project in STS
		
		git config --global user.email "you@example.com"
		>git config --global user.name "Your Name"
		>cd c:/_workspace
		>git clone https://github.com/himline/training
		>cd c:/_workspace/training/
		>git init //*** This command use only once while making new directory***\\
		>git add sanjeev.katoch
		>git commit -m "My first checkin"
		>git remote add origin https://github.com/himline/training.git  (You can skip this)
		>git push --force -u origin master
