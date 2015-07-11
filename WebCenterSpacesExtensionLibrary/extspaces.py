import time

print '\n Deploy started at ' + time.asctime() + '\n'

try: 

    mUserConfigFile = sys.argv[1]
    mUserKeyFile    = sys.argv[2]
    mAdminURL       = sys.argv[3]
    mPath           = sys.argv[4]
    mTargets        = sys.argv[5]
    mLibName        = sys.argv[6]


    connect(userConfigFile=mUserConfigFile,userKeyFile=mUserKeyFile,url=mAdminURL)
    edit()
    startEdit()
    progress=deploy(mLibName,path=mPath,upload='true',targets=mTargets,libraryModule='true',block='true')
    print '\n ### ### ###: Deploy done \n'
    print progress.isCompleted() 
    print '\n ### ### ###: Status of Deploy \n'
    dumpStack() 
    progress.printStatus()
    print '\n ### ### ###: Saving \n'
    save()
    print '\n ### ### ###: Activating \n'
    activate(block='true')
    print '############################################'
    print '#####     Deployment Complete      #########'
    print '############################################'
    exit()

except Exception, ex:
    print ex.getMessage()
    print '#########################################################'
    print '#####     Deployment Failed                     #########'
    print '#####     Contact support with Exception Stack  #########'
    print '#########################################################'
    exit()
