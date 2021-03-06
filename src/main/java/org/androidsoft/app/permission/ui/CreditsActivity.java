/* Copyright (c) 2010-2015 Pierre LEVY androidsoft.org
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.androidsoft.app.permission.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import org.androidsoft.app.permission.R;
import org.androidsoft.app.permission.service.PreferencesService;
import org.androidsoft.utils.credits.CreditsParams;
import org.androidsoft.utils.credits.CreditsView;

/**
 * Credits activity
 *
 * @author Pierre Levy
 */
public class CreditsActivity extends PermissionBaseActivity
{

    @Override
    public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);

        View view = new CreditsView(this, getCreditsParams());
        setContentView(view);

    }

    private CreditsParams getCreditsParams()
    {
        CreditsParams p = new CreditsParams();
        p.setAppNameRes(R.string.credits_app_name);
        p.setAppVersionRes(R.string.credits_current_version);
        if (PreferencesService.isThemeDark())
        {
            p.setBitmapBackgroundRes(R.drawable.background_dark);
            p.setBitmapBackgroundLandscapeRes(R.drawable.background_dark);
        }
        else
        {
            p.setBitmapBackgroundRes(R.drawable.background);
            p.setBitmapBackgroundLandscapeRes(R.drawable.background_land);
        }
        p.setArrayCreditsRes(R.array.credits);

        p.setColorDefault(0xffff8000);
        p.setTextSizeDefault(44);
        p.setTypefaceDefault(Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD));
        p.setSpacingBeforeDefault(16);
        p.setSpacingAfterDefault(28);

        p.setColorCategory(0xff33b5e5);
        p.setTextSizeCategory(34);
        p.setTypefaceCategory(Typeface.create(Typeface.SANS_SERIF, Typeface.ITALIC));
        p.setSpacingBeforeCategory(18);
        p.setSpacingAfterCategory(18);

        return p;

    }

}
