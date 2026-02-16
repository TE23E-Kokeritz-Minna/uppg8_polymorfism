void main()  {

    Djur[] djurfält = new Djur[5];

    djurfält[0] = new Hund();
    djurfält[1] = new Hund();
    djurfält[2] = new Katt();
    djurfält[3] = new Katt();
    djurfält[4] = new Mus();

    for (Djur djur : djurfält) {
        IO.println(djur.läte());
        switch (djur){
            case Katt k -> k.leka("Garn nystan");
            case Hund h -> h.spåra("Kanin");
            case Mus m -> m.klättra();
            default -> throw new IllegalStateException("Ogiltigt djur");
        }
    }

    Hund h = new Hund();

    h.apport();
    h.kom();
    h.sitt();
}
