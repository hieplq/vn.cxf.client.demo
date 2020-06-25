## How to reproduce eclipse/jetty.project#2072
# eclipse way
1. download ecipse 2020-06
2. clone this repository to [vn.cxf.client.demo]
3. run eclipse use [vn.cxf.client.demo] as workspace dir
4. install bndtool plugin from marketplace
5. import bnd workspace
6. open vn.cxf.client.app/vn.cxfc.lient.app.bndrun
7. click debug osgi to run

# command line way
1. git clone git@github.com:hieplq/vn.cxf.client.demo.git
2. cd vn.cxf.client.demo
3. ./gradlew clean build
4. cd vn.cxf.client.app/target
5. jar xvf vn.cxf.client.app.bndrun.jar
6. sh ./start