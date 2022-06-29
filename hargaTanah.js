function showresult(){
    var l=parseFloat(document.getElementById('lebar').value);
    var p=parseFloat(document.getElementById('panjang').value);
    var h=parseFloat(document.getElementById('harga').value);

    var total1 = l * p * h
    var total2 =total1 * 110/100 
    var total3 = total2 * 110/100
    var total4 = total3 * 110/100
    var total5 = total4 * 110/100 

    document.getElementById('result1').value=total1;
    document.getElementById('result2').value=total2;
    document.getElementById('result3').value=total3;
    document.getElementById('result4').value=total4;
    document.getElementById('result5').value=total5;
    }
    