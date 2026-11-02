package com.dyson.mobile.android.support.validator;

import android.text.TextUtils;
import com.dyson.mobile.android.support.guide.Section;
import mf1.a;
import mf1.b;
/* loaded from: classes3.dex */
public class SectionValidator implements a<Section> {
    @Override // mf1.a
    public final b a(Section section) {
        Section section2 = section;
        if (section2 != null) {
            if (TextUtils.isEmpty(section2.k())) {
                return new b(false, "Invalid section, the section title is null or empty");
            }
            if (TextUtils.isEmpty(section2.l())) {
                return new b(false, "Invalid section, the section type is null or empty");
            }
            String l13 = section2.l();
            l13.getClass();
            char c13 = 65535;
            switch (l13.hashCode()) {
                case -1955236909:
                    if (l13.equals("DiagnosticContentSection")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1763538484:
                    if (l13.equals("CarouselContentSection")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 136138478:
                    if (l13.equals("ContactDetailsContentSection")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1427748932:
                    if (l13.equals("AnnotatedCarouselContentSection")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            switch (c13) {
                case 0:
                    return (section2.i() == null || section2.i().isEmpty()) ? new b(false, "The diagnoses list is null or empty") : b.f53843c;
                case 1:
                case 3:
                    return (section2.m() == null || section2.m().isEmpty()) ? new b(false, "The carousel view list is null or empty") : b.f53843c;
                case 2:
                    return b.f53843c;
                default:
                    return new b(false, "Invalid section, unknown type");
            }
        }
        return new b(false, "Invalid section, the section must not be null");
    }
}
