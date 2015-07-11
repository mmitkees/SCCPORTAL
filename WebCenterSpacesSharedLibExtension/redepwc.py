import time

print '\n Redeploy of Spaces Application started at ' + time.asctime() + '\n'

try: 

    mUserConfigFile = sys.argv[1]
    mUserKeyFile    = sys.argv[2]
    mAdminURL       = sys.argv[3]

    connect(userConfigFile=mUserConfigFile,userKeyFile=mUserKeyFile,url=mAdminURL)
    progress=redeploy('webcenter',block='true')
    
    print '\n ### ### ###: Deploy done \n'
    print '\n ### ### ###: Status of Deploy \n'
    progress.printStatus()
    print '############################################'
    print '#####     ReDeploy Spaces Complete #########'
    print '############################################'
    exit()

except Exception, ex:
    print ex.getMessage()
    print '#########################################################'
    print '#####     ReDeploy Spaces Failed                #########'
    print '#####     Contact support with Exception Stack  #########'
    print '#########################################################'
    exit()
