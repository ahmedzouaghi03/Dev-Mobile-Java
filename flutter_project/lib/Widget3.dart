import 'package:flutter/material.dart';

class Class3 extends StatelessWidget {
  const Class3({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          title: const Text('3eme App Flutter'),
          backgroundColor: const Color.fromRGBO(14, 112, 20, 100),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Image.asset('shenlong.gif'),
              const SizedBox(height:10,),
              const Text("This is Shen long"),
            ],
          ),
        ),
      ),
    );
  }
}
