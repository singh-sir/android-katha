# android-katha: : using work manager's periodic work for less than 15 min as well

#Please find the screens below to understand the flow

#on screen1: doWork method triggered and UI is active and work recreated automatically
<img width="1696" alt="1" src="https://user-images.githubusercontent.com/50645128/202681367-0345c9b1-7912-4c5f-b062-0ec15f885e55.png">

#on screen2: doWork method triggered and UI is active and work recreated automatically
<img width="1696" alt="2" src="https://user-images.githubusercontent.com/50645128/202681396-717cab3f-6ee8-4119-a49c-55fb5f7ec65b.png">

#app is in background: doWork method triggered and UI is inactive and work recreated automatically
<img width="1694" alt="3" src="https://user-images.githubusercontent.com/50645128/202681482-e3b5b186-2882-450c-b2cd-d805aca6b977.png">

#app is in background: doWork method triggered and UI is inactive and work recreated automatically
<img width="1693" alt="4" src="https://user-images.githubusercontent.com/50645128/202681511-7815124f-9467-47a7-91ca-f0af2b8a3d3b.png">

#on screen3: doWork method triggered and UI is active and work recreated automatically
<img width="1698" alt="5" src="https://user-images.githubusercontent.com/50645128/202681533-92be32fd-86e6-4953-a306-cbed4c1cfd8f.png">

#on screen3: work cancelled manually
<img width="1697" alt="6" src="https://user-images.githubusercontent.com/50645128/202681556-45f3a6a2-5631-4018-9069-e65810e2ff87.png">

#app stopped by user: doWork method triggered and work cancelled automatically
<img width="1698" alt="7" src="https://user-images.githubusercontent.com/50645128/202681571-ab94a42d-36b4-4db1-a890-6a54c3489138.png">
